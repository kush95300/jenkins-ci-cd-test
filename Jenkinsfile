//Pipeline 
pipelineJob('ci-pipeleine') {
  definition {
    cps {
          script(readFileFromWorkspace('scripts/ci-pipeline.groovy'))
        }
  }
}
