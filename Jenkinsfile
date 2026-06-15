pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK21'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/priyadharshinimanikandan4/Booking_Website'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar'
            }
        }

        stage('Deploy') {
            steps {
                bat '''
                echo Deploying application outside Jenkins workspace...

                if not exist C:\\deploy mkdir C:\\deploy

                copy target\\Booking_Website-0.0.1-SNAPSHOT.jar C:\\deploy\\app.jar /Y

                echo Stopping old process (if any)...
                taskkill /F /IM java.exe /FI "WINDOWTITLE eq BookingApp" >nul 2>&1

                echo Starting new application...
                start "BookingApp" java -jar C:\\deploy\\app.jar
                '''
            }
        }
    }
}
