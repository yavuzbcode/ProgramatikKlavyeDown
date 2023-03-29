scope.launch(Dispatchers.IO) {
                                        delay(500)
                                        try {
                                            val inst = Instrumentation()
                                            inst.sendKeyDownUpSync(KeyEvent.KEYCODE_SPACE)
                                        } catch (ex: InterruptedException) {
                                            println("Hata Key: "+ex.localizedMessage)
                                        }
                                    }
