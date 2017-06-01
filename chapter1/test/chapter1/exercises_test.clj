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

(deftest test-power
  (testing "exponentiation"
    (is (= 9.0 (power 3 2)))
    (is (= 4.0 (power 2 2)))
    (is (= 1.0 (power 9 0)))
    (is (= 2.0 (power 2 1)))))

(deftest test-dot-product
  (testing "dot-product"
    (is (= 110 (dot-product '(10 20) '(3 4))))
    (is (= 28 (dot-product '(1 2 3) '(2 4 6))))))