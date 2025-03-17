pipeline{
    agnet{}
    Stages{
        stage{print hello world}
        sh"echo "hello world"
    }
}