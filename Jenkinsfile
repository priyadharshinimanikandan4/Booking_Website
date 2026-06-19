pipeline{
  agent any


    stages{
      stage('build'){
        steps{
          bat 'mvnw.cmd clean package'
        }
      }
      stage('Docker Build'){
        steps{
          bat 'docker build -t springboot_app .'
        }
      }

      stage('Docker run'){
        steps{
          bat 'docker run -d -p 8081:8080 --name springboot_container springboot_app'
        }
      }
    }
}
    
