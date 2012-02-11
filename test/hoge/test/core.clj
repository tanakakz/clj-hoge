(ns hoge.test.core
  (:use [hoge.core])
  (:use [clojure.test]))

(deftest hoge-test
  (is (= (hoge) "hoge")))

(deftest hemo-test
  (is (= (hemo) 1)))