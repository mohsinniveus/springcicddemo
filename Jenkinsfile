pipeline {
    agent {
        node {
            label 'testing'
        }
    }
    
    stage("Pushing Image to GCR") {
      steps {
        script {
          withDockerRegistry([credentialsId: "gcr:tech-rnd-project", url: "https://gcr.io"]) {
            sh "docker push gcr.io/tech-rnd-project/springcicddemo:1.0.0"
          }
        }
      }
    }
}