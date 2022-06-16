//Pipeline 
pipelineJob('ci-pipeleine') {
  definition {
    cps {
          script(readFileFromWorkspace('scripts/ci-pipeline.groovy'))
        }
  }
}

pipelineJob('cd-pipeleine') {
  definition {
    cps {
          script(readFileFromWorkspace('scripts/cd-pipeline.groovy'))
        }
  }
}

