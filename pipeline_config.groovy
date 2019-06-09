// restrict individual repository Jenkinsfiles
allow_scm_jenkinsfile = false

/*
  define libraries to load.
  available libraries are based upon the
  library sources configured.
*/
libraries {
  gradle
  a11y {
//    url = "https://example.com"
    url = "http://localhost:8088"
  }
  sdp {
    images {
      registry = "http://localhost:5000"        // registry url
      cred = "sdp-docker-registry"              // jenkins cred id to authenticate
      repo = "sdp"                              // repo to find sdp images -> currently hard coded as "sdp"
      docker_args = "--network=try-it-out_sdp"  // docker runtime args
    }
  }
  github_enterprise
  sonarqube {
    enforce_quality_gate = true
  }
  docker {
    registry = "localhost:5000"
    cred = "sdp-docker-registry"
    docker_args = "--network=try-it-out_sdp"
  }
}
