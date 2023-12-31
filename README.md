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

### سوال 1:
<br>

- اصل SRP: این اصل به معنای این است که هر ماژول( یا کلاس) باید تنها در برابر یک actor مسئول باشد یا یک دلیل برای تغییر داشته باشد. امروزه این اصل به عنوان یکی از اصول اصلی شی گرا شناخته نمی شود چرا که بسیار ریزدانه است و در فرآیندهای ایجاد نرم افزار خود به خود اعمال می شود و در اصول شش گانه شی گرا جای ندارد و به وسیله آنها، این نیز محقق می شود.
- اصل OCP: یک مصنوع نرم افزاری باید برای توسعه یا گسترش (extension) باز باشد اما برای اصلاح (modification) بسته. به عبارت دیگر، رفتار یک مصنوع نرم افزاری باید بدون نیاز به تغییر آن، قابل گسترش باشد. این اصل توسط meyer ارائه شده است. این اصل آرزوی دیرینه مهندسین نرم افزار بود که با شی گرایی محقق شد. در واقع بدون آنکه نیاز به تغییر داشته باشیم، بتوانیم به کلاس رفتار اضافه کنیم. مکانیسم رایج و معروف آن، استفاده از ارتباط غیرمستقیم است به گونه‌ای که رفتارهای قابل گسترش را با delegation و از طریق interface پیاده سازی کنیم که به آن DIP می گویند که در ادامه به آن می پردازیم. 
- اصل LSP: این اصل به موضوع روابط جانشینی می‌پردازد. فزندان باید تعهدات پدر را به طور کامل برآورده کنند و از توارث باید در جهت extension استفاده کرد. اگر فرزند تعهدات پدر مانند post-condition و pre-condition و class invariant را به درستی برآورده نسازد، از نظر منطقی، دیگر فرزند پدر نیست. در واقع توارث تنها در جهت genspec مورد قبول است و رابطه is a باید بین فرزند و پدر برقرار باشد.
- اصل ISP: این اصل به این مسئله می پردازد که قراردادها یا نماهای یک سیستم، باید به خودی خود نیز منسجم باشند. این اصل موضوع منسجم بودن را حتی در مورد نماهای یک سیستم نیز لازم می داند و توصیه می کند به جای استفاده از یک نمای غیرمنسجم برای کل سیستم، از چندین نمای ریزدانه اما منسجم استفاده کرد.
- اصل DIP: این اصل به این اشاره دارد که به جای ارتباط مستقیم به یک کلاس concrete، به interface آن متصل شویم و از طریق configuratorها، در ران تایم کلاس مربوطه را که interface مورد نظر را محقق کرده است به کلاس اصلی تزریق کنیم. این کار باعث کاهش سطح وابستگی و رساندن آن به حداقل مقدار ممکن و مطلوب است. با این کار می توان در ران تایم به کلاس ها رفتار اضافه کرد بدون آنکه نیازی به تغییر در کلاس اصلی باشد که این همان اصل OCP است. در واقع DIP مکانیزم برقراری OCP است.
<br>

### سوال 2:
<br>

 اصول SOLID در تمام طول چرخه نرم افزار مهم هستند. این اصول باعث تحقق هدف اصلی پارادایم شی گرا می شوند که تولید سیستم نرم افزاری با کیفیت است. در واقع در نگهداری و تکامل سیستم همواره دچار تغییراتی می شویم که با کمک این اصول، میتوان از پس تغییرات برآمد و محصول با کیفیت تولید کرد. در تحلیل این اصول مهم هستند اما نقش کمتری دارند. برای این مرحله لازم است که مدل تحلیل تا جای ممکن از انسجام کافی و وابستگی پایین بهره ببرد اما چون دغدغه‌ متفاوتی دارد و جزئیات به قدر کافی معلوم نیست، نقش این اصول نیز کمرنگ است. اما در طراحی و پیاده سازی بسیار نقش مهمی دارند و باید برای تضمین طول عمر سیستم و تغییراتی که در طول ایجاد نرم افزار داریم، محصول با کیفیتی پیاده سازی کنیم. امروزه در مهندسی نرم افزار تغییرات بخش جدانشدنی هستند و اعمال تغییرات در سیستم بدون رعایت این اصول می تواند منجر به بی کیفیتی و مرگ نرم افزار شود. در مرحله نگهداری و استقرار نیز باید از این اصول پیروی کرد و تغییرات را با توجه به آنها در محصول اعمال کرد تا کیفیت محصول از بین نرود.
<br>


### سوال 3:
<br>

خیر، روش توسعه تست محور (TDD) لزوماً با چرخه کلی توسعه نرم افزار در تضاد نیست. چرخه کلی توسعه نرم افزار شامل مراحل تحلیل، طراحی، پیاده سازی، تست و استقرار است. از سوی دیگر، TDD بر روی یک رویکرد خاص برای تست تمرکز دارد. TDD با تمرکز بر واحدهای کوچک و قابل آزمایش کد، یک رویکرد ایجاد افزایشی و تکراری را ترویج می کند و کمک می کند تا اطمینان حاصل شود که کد به طور کامل آزمایش شده است و ویژگی های جدید عملکرد موجود را خراب نمی کند. ابتدا با نوشتن تست، درک واضح‌تری از رفتار مورد نظر به دست می‌آید و می‌توان کدهای ماژولار و قابل نگهداری بیشتری طراحی کرد. در حالی که TDD ممکن است کمی توالی وظایف را در چرخه توسعه عمومی تغییر دهد، اما با آن تناقض ندارد و در واقع هدف آن پیاده‌سازی حداقلی و اطمینان بخش برای تحقق اهداف مورد نظر سیستم است.
<br>

### سوال 4: 
<br>

با توجه به توضیحات داده شده، این کار چندان درست نیست. اما با override کردن متود computeArea و عدم تغییر مقادیر، میتوانستیم نتیجه مطلوب را به دست بیاوریم. اما باز هم اصل LSP را نقض کرده بودیم. هرچند در خروجی این مسئله لحاظ نمی‌شود، اما برای پیشگیری از اتفاقات پیشرو و عمر نرم‌افزار در درازمدت، باید به اصول شی‌گرا وفادار ماند و آنها را  رعایت کرد. قانون مورفی در نرم‌افزار جدی است:).
