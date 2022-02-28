pipeline {
    environment {
            PATH = "C:\\WINDOWS\\SYSTEM32;C:\\Tools\\Java\\jdk-17.0.1\\bin"
    }
    agent {
            label 'tae'
        }
    

    

    stages {
        stage('Build - Selenium') {
            steps {
                bat 'mvn clean install  -Dmaven.test.failure.ignore=true'
            }
        }
        /*stage('Build - Firefox') {
            steps {
                bat 'mvn clean install -DWebDriver=Firefox -Dmaven.test.failure.ignore=true'
            }
        }*/


    }
        post {
            success {
                junit 'target/surefire-reports/**/*.xml'                       
            }
        }
    
}