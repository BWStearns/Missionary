(defproject missionary "0.1.0-SNAPSHOT"
  :description "Write 2n conversions instead of 2n!"
  :url "https://github.com/BWStearns/Missionary"
  ; :repl-options {:init-ns missionary.core}
  :main missionary.core
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/math.combinatorics "0.1.4"]
                 [aysylu/loom "1.0.0"]])
