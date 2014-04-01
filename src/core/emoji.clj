(ns core.emoji)

(def ✊a take)

(def ⏳  time)


(def  🚼   #(Thread/sleep %))

(def ➕  +)
(def ➖  -)
(def ➗  /)
(def ✖️  *)

(def ❗️  swap!)
(def ‼️  reset!)
(def 📬  deref)

(defmacro 🔃  [& stuff] `(loop ~@stuff))

(def 🆔  keyword)

(def 📶  sort)

(def 🔑  keys)

(def 💉  assoc)
(def 💩  dissoc)


(def 🔗  conj)


(def ⬅️  first)
(def ➡️  last)

(def 🔀  interleave)

(def 📥  cons)
(def 📤  pop)

(defmacro ✒️  [& stuff] `(defn ~@stuff))

(def 🍻  =)

(def ❌  not)


(def 👀  find)

(def ✅  true)
(def ❎  false)

(defmacro ✏️  [& stuff] `(def ~@stuff))
