//Pipeline 
pipelineJob('ci-pipeleine') {
  description(String "CI Pipeline to build and upload the image to GCR")
  definition {
    cps {
          script(readFileFromWorkspace('scripts/ci-pipeline.groovy'))
        }
  }
}

pipelineJob('cd-pipeleine') {
  description(String "CD Pipeline to deploy the image to Gke")
  definition {
    cps {
          script(readFileFromWorkspace('scripts/cd-pipeline.groovy'))
        }
  }
}

