# CS190: Tools
### November 22, 2016
<!--.element: class="subtitle" style="text-align: center" -->



<!-- .slide: data-background-image="assets/theend.gif" -->



# Lecture 8:
### Be Awesome <!-- .element: class="subtitle" style="text-align: center" -->



## Tips and Tricks:
<!--.element: style="text-align: center;" -->
### Make your workflow awesome
<!--.element: class="subtitle" style="text-align: center; font-size: 24pt; margin-top: -20px;" -->


## SSH Keys
* SSH keys provide a more secure way of logging into a server than using a password alone.
* It also means **no more passwords**! <span style="font-size: 16pt;">(kinda)</span>
* SSH keys are *paired keys* which means that each key has a public part and a private part.


## SSH Keys (continued)
* Private Keys (`~/.ssh/id_rsa`)
  - Stays on the client machine (your personal computer)
  - Never ever ever give them to anyone
* Public Keys (`~/.ssh/id_rsa.pub`)
  - Stays on the remote machine (the server you're connecting to)
  - This is the part of the key you give out


## SSH Keys (continued)
* `~/.ssh/authorized_keys` is the file you place public keys in.
![Authorized Keys screenshot](assets/authorized_keys.png)<!-- .element: class="center" style="border: 0; box-shadow: none;"-->


## SSH Keys (continued)
![Keys diagram](assets/key.png)<!-- .element: class="center" style="border: 0; box-shadow: none;"-->
