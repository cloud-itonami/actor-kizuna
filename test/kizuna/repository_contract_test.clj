(ns kizuna.repository-contract-test
  (:require [clojure.edn :as edn]
            [clojure.test :refer [deftest is]]
            [clojure.java.io :as io]))

(deftest canonical-repository-shape
  (doseq [path ["manifest.edn" "identity.edn" "dependencies.edn"
                "repository-contracts.edn" "actor.edn" "schema.edn"
                "kotoba.app.edn" "data/seed-interactions.kotoba.edn"]]
    (is (some? (edn/read-string (slurp path))) path))
  (is (not (.exists (io/file "manifest.jsonld"))))
  (is (not (.exists (io/file "tests")))))
