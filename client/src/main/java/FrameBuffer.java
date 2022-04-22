import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public abstract class FrameBuffer {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "[I")
	protected int[] pixels;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "Ljava/awt/Image;")
	protected Image image;

	@OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
	protected int height;

	@OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
	protected int width;

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
	public abstract void draw(@OriginalArg(2) Graphics arg0);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public final void makeTarget() {
		Static129.method2491(this.pixels, this.width, this.height);
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIILjava/awt/Graphics;I)V")
	public abstract void method4191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Graphics arg3, @OriginalArg(5) int arg4);

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZILjava/awt/Component;)V")
	public abstract void init(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2);
}
