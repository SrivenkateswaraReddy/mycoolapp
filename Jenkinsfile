pipeline {
    agent {
        any
       }
    tools {
            maven '3.9.1'
           }
    stages {
        stage('maven -version') {
            sh 'mvn -version'
        }
        stage('Git checkout scm') {
            steps {
                git branch: 'main', url: 'https://github.com/SrivenkateswaraReddy/mycoolapp.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                sh 'mvn deploy'
            }
        }
    }
}
