(ns whackmole)

;(defn drawMole [index]
;  (js/jQuery )
;  )


(def score 0)

(defn jq [arg] (js/jQuery arg))

(defn bind-events [] (.click (jq ".hole")
                       (fn [this]
                         (.removeClass (jq (.-target this)) "holeWithMole" )

                         )))

(defn mole-at [n] (.addClass (jq (.get (jq ".hole") n)) "holeWithMole" ))

(js/jQuery bind-events)

(js/setInterval  (fn [] (mole-at (rand-int 4) ) ) 1000 )

