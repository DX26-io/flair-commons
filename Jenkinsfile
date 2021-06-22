node {
    stage('Checkout SCM') {
        echo 'Clone SCM'
        checkout scm
    }
    stage('Test and Package') {
        echo '[INFO] Test and Package'
        mvn clean package
    }
    stage('Publish results') {
        echo '[INFO] [TODO] Publish tests'
    }
    stage('Deploy Artifact') {
        echo '[INFO] Deploy Artifacts'
        if (env.BRANCH_NAME == 'master') {
            mvn -B release:clean release:prepare release:perform
        } else {
            mvn clean deploy
        }
    }
}
