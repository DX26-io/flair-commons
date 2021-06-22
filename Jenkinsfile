node {

    stage('Checkout SCM') {
        cleanWs()
        echo 'Clone SCM'
        checkout scm
    }

    if (env.BRANCH_NAME == 'master') {
        environment {
            GIT_CREDS = credentials('github-creds')
        }
        stage('Deploy Artifact') {
            echo '[INFO] Checking out master'
            sh 'git checkout -f master'
            echo '[INFO] Deploy Artifacts'
            sh 'mvn -B release:clean release:prepare release:perform -Dusername=${GIT_CREDS_USR} -Dpassword=${GIT_CREDS_PSW}'
        }
    } else {
        stage('Test and Package') {
            echo '[INFO] Test and Package'
            sh 'mvn clean package'
        }
        stage('Publish results') {
            echo '[INFO] [TODO] Publish tests'
        }
    }
}
