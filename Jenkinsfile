//Pipeline 
pipelineJob('ci-pipeleine') {
  description('CI Pipeline to build and upload the image to GCR')
   triggers {
        githubPush()
    }
  definition {
    cps {
          script(readFileFromWorkspace('scripts/ci-pipeline.groovy'))
        }
  }
}

pipelineJob('cd-pipeleine') {
  description('CD Pipeline to deploy the image to Gke')
  definition {
    cps {
          script(readFileFromWorkspace('scripts/cd-pipeline.groovy'))
        }
  }
}

