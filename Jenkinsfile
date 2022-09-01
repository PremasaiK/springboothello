
pipeline{

	agent any

  
	stages {
    
	stage('Build') {
        	steps {
	        echo "came here"
        	sh "mvn compile"  	 
        	}
    	}
    	stage("Unit test") {          	 
        	steps {  	 
            	sh "mvn test"          	 
       	    }
	}
}
