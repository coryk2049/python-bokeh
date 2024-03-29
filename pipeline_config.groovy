// restrict individual repository Jenkinsfiles
allow_scm_jenkinsfile = false
/*
  define libraries to load.
  available libraries are based upon the library sources configured.
*/
libraries {
  example_library
//  gradle
  a11y {
//    url = "https://example.com"
    url = "http://localhost:5006"
  }
  sdp {
    images {
	  registry = "http://docker-registry.default.svc:5000"
      cred = "openshift-docker-registry"              
      //cred = "sdp-docker-registry" 
	  repo = "sdp"
    }
  }
  github_enterprise
  sonarqube {
    enforce_quality_gate = false
  }
  docker {
	registry = "docker-registry.default.svc:5000/onr" 
    cred = "openshift-docker-registry"
      //cred = "sdp-docker-registry"
  }
}
