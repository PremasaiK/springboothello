
pipeline{

	agent any

  
	stages {
    
		stage('Build') {

			steps {
				echo "${BUILD_NUMBER}"
				sh 'mvn test'
			}
		}

}
