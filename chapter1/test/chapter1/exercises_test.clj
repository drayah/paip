(ns chapter1.exercises-test
  (:require [clojure.test :refer :all]
            [chapter1.exercises :refer :all]))

(deftest test-last-name
  (testing "name without post-nominal title"
    (is (= "martina" (last-name "martina"))))
  (testing "name with one post-nominal title"
    (is (= "giovanni martina" (last-name "giovanni martina bsc"))))
  (testing "name with multiple post-nominal titles"
    (is (= "john doe" (last-name "john doe phd md ac")))))