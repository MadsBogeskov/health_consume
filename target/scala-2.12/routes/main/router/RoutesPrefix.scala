// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/mark/repos/health_consume/conf/routes
// @DATE:Tue Jul 10 15:57:05 CEST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
