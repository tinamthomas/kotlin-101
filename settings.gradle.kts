rootProject.name = "demo"
include("src:integrationtest")
findProject(":src:integrationtest")?.name = "integrationtest"
include("src:integrationtest")
findProject(":src:integrationtest")?.name = "integrationtest"
include("src:integrationtest:untitled")
findProject(":src:integrationtest:untitled")?.name = "untitled"
