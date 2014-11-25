(defproject com.cognitect/onto "0.1.0-SNAPSHOT"
  :description  "Ontological inferencing for Datomic"
  :license      {:name "Copyright 2014, Cognitect, Inc. All rights reserved."}

  :plugins      [[codox "0.8.10"]]

  :dependencies [[com.cognitect.sim-ng/db-util   "0.1.0-SNAPSHOT"]
                 [org.clojure/clojure            "1.7.0-alpha4"]
                 [com.datomic/datomic-pro        "0.9.4815.12"]]

  :profiles     {:dev {:dependencies [[org.clojure/test.check      "0.5.8"]]}}

  :jvm-opts     ["-Xmx2g" "-Xms2g" "-server" "-Ddatomic.objectCacheMax=128m"
                 "-Ddatomic.memoryIndexMax=256m" "-Ddatomic.memoryIndexThreshold=32m"])