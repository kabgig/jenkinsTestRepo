pipeline {
    agent any

    environment {
        // Define environment variables for Java 17 and Maven
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64' // Set your Java 17 home path
        MAVEN_HOME = '/usr/share/maven' // Set your Maven home path
        PATH = "${JAVA_HOME}/bin:${MAVEN_HOME}/bin:${PATH}"
    }

    stages {
        stage('Checkout') {
            steps {
                // Check out the code from your GitHub repository
                checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/kabgig/jenkinsTestRepo.git']]])
            }
        }

        stage('Build') {
            steps {
                // Build your Java project (assuming it's a Maven project)
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests if applicable
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                // Deploy your application or perform additional steps here
                // For a Spring Boot app, you can run it with 'java -jar'
                sh 'java -jar target/jenkinsTestProject1-0.0.1-SNAPSHOT.jar'
            }
        }
    }

    post {
        success {
            // Define post-build actions here, e.g., notifications
        }
    }
}
