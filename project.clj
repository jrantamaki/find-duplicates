(defproject find-duplicates "0.1.0-SNAPSHOT"
  :description "Small hack to find duplicate files in a given directory"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :profiles {
  :dev      {:dependencies [[midje "1.5.1"]]}}
  :main find-duplicates.core)
