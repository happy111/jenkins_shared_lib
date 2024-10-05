def call(String projectName) {
    sh "docker build -t ${projectName}:latest ."
}
