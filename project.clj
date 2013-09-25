(defproject simulator "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1859"]]

  :plugins [[lein-cljsbuild "0.3.3"]]

  :hooks [leiningen.cljsbuild]

  :ring {:handler simulator.handler/app}

  ;; cljsbuild options configuration
  :cljsbuild {
              :repl-listen-port 9000
              :builds {
              :dev
              {:source-paths ["src/main/cljs"]
               :compiler {:output-to "target/generated/scripts/app.js"
                          :optimizations :whitespace
                          :warnings true
                          :pretty-print true}}

              :prod
              {:source-paths ["src/main/cljs"]
               :compiler {:output-to "target/generated/scripts/app.js"
                          :optimizations :advanced
                          :warnings true
                          :pretty-print false}}}})
