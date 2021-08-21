pipeline{
    agent any
  stages{
    stage('SCM Checkout'){
        steps{
        git 'https://github.com/Hitais/github-jenkins'
        } 
    }
      stage('build'){
          steps{
              sh "mvn cleanup"
          }
      }
    }
}
