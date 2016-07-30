(ns hello-clj.core
  (:gen-class))

(defn print-owner
  [x y]
  (println (str x y))
)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
