pipeline {
    agent {
        node {
            label 'master'
        }
    }
    
    stages {
        stage("Pushing Image to GCR") {
	      steps {
	        script {
	          withDockerRegistry([credentialsId: "tech-rnd-project", url: "https://gcr.io"]) {
	            sh "docker push gcr.io/tech-rnd-project/springcicddemo:1.0.0"
	          }
	        }
	      }
    	}
    }
    
    
}