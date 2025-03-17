pipeline{
    agnet{}
    Stages{
        stage{print hello world}
        sh"echo hello world"   // testing feature
        sh"echo hello India"
    }
}
