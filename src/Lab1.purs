module Lab1 where

import Prelude
import Data.List (List(..), reverse)
import Data.Foldable (foldl)

import Effect (Effect)
import Effect.Console (log)

infixr 6 Cons as :


singleton :: forall a. a -> List a
singleton x = x : Nil

null :: forall a. List a -> Boolean
null Nil = true
null _ = false

snoc :: forall a. List a -> a -> List a
snoc xs x = reverse ( x :(reverse xs))


length :: forall a. List a -> Int
length = foldl (\n _ -> n + 1) 0

test :: Effect Unit
test = do
  log $ show $ singleton ("v")
  log $ show $ null (1 : Nil)
  log $ show $ snoc ("2": "7" : Nil) ("1") 
  log $ show $ length (2 : 1 : Nil) 
  
  
  
 
