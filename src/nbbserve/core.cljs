(ns nbbserve.core
  (:require ["express$default" :as express]))

(def app (express))
(def port 8092)

(.use app (.static express (.cwd js/process)))

(.listen app port
         (fn []
           (println "Example app listening on port" port)))
