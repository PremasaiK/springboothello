
pipeline{

	agent any

	environment {
		DOCKERHUB_CREDENTIALS=credentials('docker-premasaik')
		POD_NAME = "tmp"
	}
  
	stages {
    
		stage('Build') {

			steps {
				echo "${BUILD_NUMBER}"
				sh 'mvn test'
			}
		}

	post {
		always {
			sh 'docker logout '
		}
	}

}
