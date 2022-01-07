#!groovy
pipeline {
    agent none
   stages {     
    stage('Maven Install') {
      agent {         
       docker {          
     }       
  }       
  steps {
       sh 'mvn clean install'
       }
     }
   }
 }