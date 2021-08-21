pipeline{
    agent any
    enivironment{
        PATH ="C:\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin:$PATH"
    }
  stages{
    stage('SCM Checkout'){
        steps{
        git 'https://github.com/Hitais/github-jenkins'
        } 
    }
      stage('build'){
          steps{
              sh "mvn clean install"
          }
      }
    }
}
