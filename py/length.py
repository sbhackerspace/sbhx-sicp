#!/usr/bin/env python
# Steve Phillips / fraktil
# 2010.12.28

# From http://mitpress.mit.edu/sicp/full-text/book/book-Z-H-15.html

# # (define (length items)
# #   (if (null? items)
# #       0
# #       (+ 1 (length (cdr items)))))

# # (define odds (list 1 3 5 7))
# # (length odds)
# # 4

def length(items):
    if not items:
        return 0
    else:
        return 1 + length(items[1:])

odds = [1, 3, 5, 7]
#odds = range(1, 8, 2)
print length(odds)  # 4
