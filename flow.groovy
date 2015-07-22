node {
  git 'https://github.com/compozed/docker-ci-demo.git'

  def maven = docker.image('maven:3.3.3-jdk-8'); // https://registry.hub.docker.com/_/maven/

  stage 'Mirror'
  // First make sure the slave has this image.
  // (If you could set your registry below to mirror Docker Hub,
  // this would be unnecessary as maven.inside would pull the image.)
  maven.pull()
}
