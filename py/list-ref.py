#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2010.12.28

# From http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-15.html

### Original Lisp
# # (define (list-ref items n)
# #   (if (= n 0)
# #       (car items)
# #       (list-ref (cdr items) (- n 1))))

# # (define squares (list 1 4 9 16 25))
# # (list-ref squares 3)
# # 16

def list_ref(items, n):
    if n == 0:
        return items[0]
    else:
        return list_ref(items[1:], n-1)

squares = [1, 4, 9, 16, 25]
#squares = [x**2 for x in [1, 2, 3, 4, 5] ]
#squares = [x**2 for x in range(1, 6)]
print list_ref(squares, 3)  # 16
