pipeline{
    agent any

    tools {
         maven 'Maven'
    }

    stages{
        stage('checkout'){
            steps{
                checkout (
                    changelog: false, 
                    poll: false, 
                    scm: scmGit(
                        branches: [[name: '*/master']], 
                        extensions: [], 
                        userRemoteConfigs: [[url: 'https://github.com/KinKinovich/java-hello-world-with-maven.git']]
                    )
                )
            }
        }
        stage('build'){
            steps{
               bat 'mvn test surefire-report:report'
            }
        }
        stage('tests'){
            steps{
                // Архивация XML-отчётов
                junit 'target/surefire-reports/*.xml'
                
                // Публикация HTML-отчёта (если используется)
                publishHTML(target: [
                    reportDir: 'target/reports',
                    reportFiles: 'surefire.html',
                    reportName: 'Surefire Report'
                ])
            }
        }
    }
}
