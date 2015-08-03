(defproject runningeve "0.1.0-SNAPSHOT"
  :description "runningeve."
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :dev-dependencies [[net.sourceforge.plantuml/plantuml "8025"]]
  :plugins [[lein-plantuml "0.1.17"]]
  :checksum :warn
  :plantuml [["domain/*.puml" :png "domain/png"]]
  :main ^:skip-aot runningeve.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
