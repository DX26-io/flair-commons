node {

    stage('Checkout SCM') {
        echo 'Clone SCM'
        checkout scm
    }

    if (env.BRANCH_NAME == 'master') {
        stage('Deploy Artifact') {
            echo '[INFO] Checking out master'
            sh 'git checkout -f master'
            echo '[INFO] Deploy Artifacts'
            sh 'mvn -B release:clean release:prepare release:perform'
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
