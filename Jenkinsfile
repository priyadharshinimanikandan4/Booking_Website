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
        echo Deploying application...

        if not exist C:\\deploy mkdir C:\\deploy

        copy target\\Booking_Website-0.0.1-SNAPSHOT.jar C:\\deploy\\app.jar /Y

        echo Starting application in background...

        cd C:\\deploy
        start "" cmd /c "java -jar app.jar > app.log 2>&1"
        '''
    }
}
    }
}
