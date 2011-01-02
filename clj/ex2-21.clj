; Steve Phillips / elimisteve
; 2010.12.29

;;;; Lead-in

;;; Original Lisp
;; (define (scale-list items factor)
;;   (if (null? items)
;;       nil
;;       (cons (* (car items) factor)
;;             (scale-list (cdr items) factor))))

;; (scale-list (list 1 2 3 4 5) 10)
;; (10 20 30 40 50)


(defn scale-list [items factor]
  (for [num items]
    (* num factor)))

(println (scale-list [1 2 3 4 5] 10))  ; (10 20 30 40 50)


;;;; Actual Exercise

;; (define (square-list items)
;;   (if (null? items)
;;       nil
;;       (cons <??> <??>)))

(defn square-list-cons [items]
  (if (empty? items)
    nil
    (cons (* (first items) (first items)) (square-list-cons (rest items)))))

(println (square-list-cons (list 1 2 3 4)))  ; (1 4 9 16)


;; (define (square-list items)
;;   (map <??> <??>))

(defn square-list-map [items]      
  (map (fn [x] (* x x)) items))

(println (square-list-map (list 1 2 3 4)))  ; (1 4 9 16)
