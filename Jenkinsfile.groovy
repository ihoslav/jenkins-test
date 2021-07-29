node{
    properties([pipelineTriggers([cron('* * * * *')])])
    timestamps {


    stage('greeting') {
        
        echo 'hello world'
    }
    
    }  
}

node {
    
    properties([pipelineTriggers([upstream('greeting')])])
    
    timestamps {
    stage('thanks'){
        
       echo 'good job'
    }
}
    
}