pipeline {
    agent any
   /* tools{
        jdk "java"
        gradle "gre"
    } */
    stages {
        stage('Gradle Build') {
            steps {
               // sh 'chmod +x gradlew'
               // sh './gradlew clean build' 
            }
        }
        stage('Logging into AWS ECR') {
            steps {
                sh "aws ecr get-login-password --region ${secrets.AWS_DEFAULT_REGION} | docker login --username AWS --password-stdin ${secrets.AWS_ACCOUNT_ID}.dkr.ecr.${secrets.AWS_DEFAULT_REGION}.amazonaws.com"
            }
        } /*
        stage('Building image') {
      steps{
        script {
          dockerImage = docker.build 
        }
      }
    } */
        /*
        stage('Deploy'){
            steps{
            //    sh 'docker build -t logs-back-end-container .'
            //    sh 'docker run -p 8080:8080 logs-back-end -d'
            //    sh 'docker-compse up --force-recreate --build -d'
            //   sh 'docker ps'
            }
        } */
    }
}
