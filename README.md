 # محاسبه‌گر مساحت

 در این پروژه ابتدا یک کلاس مستطیل داشتیم که طول و عرض آن مشخص بود و متود computeArea مساحت آن را محاسبه می‌کرد. 
<br>
 در ادامه به آن متودهای setter و getter اضافه کردیم تا به کمک آن بتوان مقادیر طول و عرض را تغییر داد.
<br>
مطابق دستور کار برنامه به گونه‌ای تغییر داده شد تا بتوان به آن مربع اضافه کرد. 
<br>
در اینجا مربع فرزند مستطیل به حساب نمی‌آید، چرا که مشخصات پدر را ندارد. حالت پدر به دو متغیر طول و عرض وابسته است در حالی که در مربع، تنها به طول بستگی دارد.
در نتیجه مربع نمی‌توان به درستی جانشین مستطیل باشد و اصل Liskov Substitution نقض می‌شود. در نتیجه می‌توان به روش‌های دیگری عمل کرد. 
<br>
روشی که ما با توجه به مسئله و رعایت اصل سادگی انتخاب کردیم، تهیه یک interface مشترک برای دو کلاس مربع و مستطیل بود. چرا که هر دو از خانواده شکل به حساب می‌آیند. در نتیجه با تعیین پارامترهای مناسب برای هر کدام از کلاس‌ها، مسئله به درستی کامل شد.

## سوالات

### سوال 1: <br>
اصل اول: SRP: این اصل به معنای این است که هر کلاس باید تنها یک دلیل برای تغییر داشت هباشد یعنی اکتورهای متفاوتی از تغییر یک کلاس محبور به adapt شدن نشوند.
<br>
اصل دوم: OCP: کلاس‌ها باید جوری نوشته شوند که بعدها در تغییرات در اصل کد نوشته شده تغییری ایجاد نشود و تنها برای update کردن کد قبلی دست به تغییرات در کلاس بزنیم.
<br>
اصل سوم: LSP: هر child باید با parentش رابطه is A داشته باشد. یعنی یعنی هر متدی در child نباید pre-condition قوی تری داشته باشد و نباید post-conditionش قوی تر باشد. یعنی کارهایی که پدر میکند را باید بکند و نباید نپذیرد و مچپنین باید کارهای اضافه تری که لازم است child بکند را نیز انجام دهد. 
<br>
اصل چهارم: ISP: این اصل ی جورایی به ما میگوید که درست کردن چند interface بهتر ازین است که یک اینترفیس گنده همه کاره داشته باشیم. این یک جورایی مث <a href="https://en.wikipedia.org/wiki/God_object"> god class </a> درست کردن است و باعث می‌شود نتوانیم کلاس هایی را از اینترفیس‌هایی پیاده سازی کنیم و همه چیز را باید در همه کلاس‌ها با ایمپلیمنت کردن اینترفیس پیاده سازی کنیم.
<br>
اصل پنچم: DIP: منظور از این اصل این است که کلاس‌ها را بر اساس abstraction با هم تعامل کنند بهتر است. این خوب نیست که در یک کلاس به طور مستقیم از یک کلاس دیگر instance وجود داشته باشد و coupling بالا رود.  
<br>


### سوال 2:
<br>
	
این اصول بیشتر در گام تحلیل در ذهن باید شکل بگیرند. این اصول باید وقتی داریم کدمان را تحلیل میکنیم و ارتباط بین classها را در میاوریم در ذهن ما حواسمان بهش باشند و بعدا ما بتوانیم آن‌ها را در بخش طراحی روی کار بیاوریم. 
		



### سوال 3:
<br>
خیر تناقضی ندارد. نوشتن تست در ابتدای کار به برنامه‌نویس این امکان را می‌دهد که بر اساس تست‌های نوشته شده کد خود را بنویسد و این دید باز نسبت به نیاز‌های مسئله کمک می‌کند که کد‌نویسی نیز سریع‌تر و کم‌هزینه‌تر شود.
<br> 
در مدل سنتی اما تست‌ها بعد از develop کد نوشته می‌شد که این نیز روشی هست که ما از صحت کد خود با خبر می‌شویم  با اطمینان ان را تحویل می‌دهیم و این دو روش ابدا تناقضی با هم ندارند.


### سوال 4: 
<br>

با توجه به توضیحات داده شده، این کار چندان درست نیست. اما با override کردن متود computeArea و عدم تغییر مقادیر، میتوانستیم نتیجه مطلوب را به دست بیاوریم. اما باز هم اصل LSP را نقض کرده بودیم. هرچند در خروجی این مسئله لحاظ نمی‌شود، اما برای پیشگیری از اتفاقات پیشرو و عمر نرم‌افزار در درازمدت، باید به اصول شی‌گرا وفادار ماند و آنها را  رعایت کرد. قانون مورفی در نرم‌افزار جدی است:).
